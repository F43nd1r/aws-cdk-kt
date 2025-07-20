package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun buildWarmThroughputProperty(initializer: @AwsCdkDsl CfnTable.WarmThroughputProperty.Builder.() -> Unit = {}): CfnTable.WarmThroughputProperty = CfnTable.WarmThroughputProperty.Builder().apply(initializer).build()
