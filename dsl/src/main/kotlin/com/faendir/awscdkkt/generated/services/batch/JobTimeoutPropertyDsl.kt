package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun buildJobTimeoutProperty(initializer: @AwsCdkDsl
    CfnJobDefinition.JobTimeoutProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.JobTimeoutProperty =
    CfnJobDefinition.JobTimeoutProperty.Builder().apply(initializer).build()
