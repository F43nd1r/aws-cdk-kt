@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnClassifier

public
    fun grokClassifierProperty(initializer: CfnClassifier.GrokClassifierProperty.Builder.() -> Unit):
    CfnClassifier.GrokClassifierProperty =
    CfnClassifier.GrokClassifierProperty.builder().apply(initializer).build()
