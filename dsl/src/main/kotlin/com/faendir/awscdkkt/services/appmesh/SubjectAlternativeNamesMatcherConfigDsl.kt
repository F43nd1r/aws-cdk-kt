package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig

@Generated
public
    fun subjectAlternativeNamesMatcherConfig(initializer: SubjectAlternativeNamesMatcherConfig.Builder.() -> Unit
    = {}): SubjectAlternativeNamesMatcherConfig =
    SubjectAlternativeNamesMatcherConfig.builder().apply(initializer).build()
