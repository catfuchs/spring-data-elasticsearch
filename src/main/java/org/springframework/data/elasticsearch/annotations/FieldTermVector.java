package org.springframework.data.elasticsearch.annotations;

/**
 * @author Benedikt Fuchs
 */
public enum FieldTermVector {
    Auto, no, yes, with_positions, with_offsets, with_positions_offsets
}
