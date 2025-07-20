package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnResourceVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceVersion(
  id: String,
  props: CfnResourceVersionProps,
  initializer: @AwsCdkDsl CfnResourceVersion.() -> Unit = {},
): CfnResourceVersion = CfnResourceVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceVersion(id: String, initializer: @AwsCdkDsl CfnResourceVersion.Builder.() -> Unit = {}): CfnResourceVersion = CfnResourceVersion.Builder.create(this, id).apply(initializer).build()
