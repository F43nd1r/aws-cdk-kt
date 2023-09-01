package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnClassifier

@Generated
public fun buildGrokClassifierProperty(initializer: @AwsCdkDsl
    CfnClassifier.GrokClassifierProperty.Builder.() -> Unit = {}):
    CfnClassifier.GrokClassifierProperty =
    CfnClassifier.GrokClassifierProperty.Builder().apply(initializer).build()
