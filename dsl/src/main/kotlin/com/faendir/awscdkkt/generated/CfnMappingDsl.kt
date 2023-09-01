package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnMapping
import software.amazon.awscdk.CfnMappingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMapping(id: String, initializer: @AwsCdkDsl CfnMapping.() -> Unit = {}):
    CfnMapping = CfnMapping(this, id).apply(initializer)

@Generated
public fun Construct.cfnMapping(
  id: String,
  props: CfnMappingProps,
  initializer: @AwsCdkDsl CfnMapping.() -> Unit = {},
): CfnMapping = CfnMapping(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMapping(id: String, initializer: @AwsCdkDsl
    CfnMapping.Builder.() -> Unit = {}): CfnMapping = CfnMapping.Builder.create(this,
    id).apply(initializer).build()
