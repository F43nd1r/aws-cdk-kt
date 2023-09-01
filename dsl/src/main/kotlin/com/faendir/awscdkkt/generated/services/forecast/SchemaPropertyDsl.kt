package com.faendir.awscdkkt.generated.services.forecast

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.forecast.CfnDataset

@Generated
public fun buildSchemaProperty(initializer: @AwsCdkDsl CfnDataset.SchemaProperty.Builder.() -> Unit
    = {}): CfnDataset.SchemaProperty =
    CfnDataset.SchemaProperty.Builder().apply(initializer).build()
