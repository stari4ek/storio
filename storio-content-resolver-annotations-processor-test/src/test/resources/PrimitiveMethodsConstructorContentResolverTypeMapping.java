package com.pushtorefresh.storio3.contentresolver.annotations;

import com.pushtorefresh.storio3.contentresolver.ContentResolverTypeMapping;

/**
 * Generated mapping with collection of resolvers.
 */
public class PrimitiveMethodsConstructorContentResolverTypeMapping extends ContentResolverTypeMapping<PrimitiveMethodsConstructor> {
    public PrimitiveMethodsConstructorContentResolverTypeMapping() {
        super(new PrimitiveMethodsConstructorStorIOContentResolverPutResolver(),
                new PrimitiveMethodsConstructorStorIOContentResolverGetResolver(),
                new PrimitiveMethodsConstructorStorIOContentResolverDeleteResolver());
    }
}