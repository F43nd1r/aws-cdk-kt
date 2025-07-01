package com.faendir.awscdkkt.generated.cloud_assembly_schema

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloud_assembly_schema.FeatureFlag

@Generated
public fun buildFeatureFlag(initializer: @AwsCdkDsl FeatureFlag.Builder.() -> Unit = {}):
    FeatureFlag = FeatureFlag.Builder().apply(initializer).build()
