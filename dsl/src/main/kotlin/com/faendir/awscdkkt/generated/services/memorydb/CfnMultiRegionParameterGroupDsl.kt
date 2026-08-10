package com.faendir.awscdkkt.generated.services.memorydb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnMultiRegionParameterGroup
import software.amazon.awscdk.services.memorydb.CfnMultiRegionParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMultiRegionParameterGroup(id: String, initializer: @AwsCdkDsl CfnMultiRegionParameterGroup.() -> Unit = {}): CfnMultiRegionParameterGroup = CfnMultiRegionParameterGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnMultiRegionParameterGroup(
  id: String,
  props: CfnMultiRegionParameterGroupProps,
  initializer: @AwsCdkDsl CfnMultiRegionParameterGroup.() -> Unit = {},
): CfnMultiRegionParameterGroup = CfnMultiRegionParameterGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMultiRegionParameterGroup(id: String, initializer: @AwsCdkDsl CfnMultiRegionParameterGroup.Builder.() -> Unit = {}): CfnMultiRegionParameterGroup = CfnMultiRegionParameterGroup.Builder.create(this, id).apply(initializer).build()
