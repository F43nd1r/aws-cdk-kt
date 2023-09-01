package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnJson
import software.amazon.awscdk.CfnJsonProps
import software.constructs.Construct

@Generated
public fun Construct.cfnJson(
  id: String,
  props: CfnJsonProps,
  initializer: @AwsCdkDsl CfnJson.() -> Unit = {},
): CfnJson = CfnJson(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnJson(id: String, initializer: @AwsCdkDsl CfnJson.Builder.() -> Unit =
    {}): CfnJson = CfnJson.Builder.create(this, id).apply(initializer).build()
