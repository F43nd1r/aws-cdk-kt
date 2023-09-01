package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun buildHttpApiEventProperty(initializer: @AwsCdkDsl
    CfnFunction.HttpApiEventProperty.Builder.() -> Unit = {}): CfnFunction.HttpApiEventProperty =
    CfnFunction.HttpApiEventProperty.Builder().apply(initializer).build()
