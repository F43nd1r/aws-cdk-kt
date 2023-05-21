package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnClassifier

@Generated
public
    fun jsonClassifierProperty(initializer: CfnClassifier.JsonClassifierProperty.Builder.() -> Unit
    = {}): CfnClassifier.JsonClassifierProperty =
    CfnClassifier.JsonClassifierProperty.builder().apply(initializer).build()
