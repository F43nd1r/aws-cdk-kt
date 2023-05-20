@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnClassifier

public
    fun csvClassifierProperty(initializer: CfnClassifier.CsvClassifierProperty.Builder.() -> Unit):
    CfnClassifier.CsvClassifierProperty =
    CfnClassifier.CsvClassifierProperty.builder().apply(initializer).build()
