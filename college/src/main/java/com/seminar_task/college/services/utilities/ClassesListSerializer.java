package com.seminar_task.college.services.utilities;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.seminar_task.college.repository.entity.CollegeClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassesListSerializer extends StdSerializer<List<CollegeClass>> {

    public ClassesListSerializer() {
        this(null);
    }

    public ClassesListSerializer(Class<List> t) {
        super(t);
    }

    @Override
    public void serialize(
            List<CollegeClass> collegeClasses,
            JsonGenerator generator,
            SerializerProvider provider)
            throws IOException, JsonProcessingException {

        List<Integer> ids = new ArrayList<>();
        for (CollegeClass collegeClass : collegeClasses) {
            ids.add(collegeClass.getClassId());
        }
        generator.writeObject(ids);
    }
}
