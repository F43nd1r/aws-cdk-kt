package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties

@Generated
public
    fun awsCloudFormationStackProperties(initializer: AwsCloudFormationStackProperties.Builder.() -> Unit
    = {}): AwsCloudFormationStackProperties =
    AwsCloudFormationStackProperties.builder().apply(initializer).build()
