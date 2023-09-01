package com.faendir.awscdkkt.generated.services.lakeformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnResource
import software.amazon.awscdk.services.lakeformation.CfnResourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResource(
  id: String,
  props: CfnResourceProps,
  initializer: @AwsCdkDsl CfnResource.() -> Unit = {},
): CfnResource = CfnResource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResource(id: String, initializer: @AwsCdkDsl
    CfnResource.Builder.() -> Unit = {}): CfnResource = CfnResource.Builder.create(this,
    id).apply(initializer).build()
