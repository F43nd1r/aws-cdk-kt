package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnClassifier

@Generated
public
    fun grokClassifierProperty(initializer: CfnClassifier.GrokClassifierProperty.Builder.() -> Unit
    = {}): CfnClassifier.GrokClassifierProperty =
    CfnClassifier.GrokClassifierProperty.builder().apply(initializer).build()
