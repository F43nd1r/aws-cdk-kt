package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersion
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPublicTypeVersion(id: String, initializer: @AwsCdkDsl
    CfnPublicTypeVersion.() -> Unit = {}): CfnPublicTypeVersion = CfnPublicTypeVersion(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnPublicTypeVersion(
  id: String,
  props: CfnPublicTypeVersionProps,
  initializer: @AwsCdkDsl CfnPublicTypeVersion.() -> Unit = {},
): CfnPublicTypeVersion = CfnPublicTypeVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPublicTypeVersion(id: String, initializer: @AwsCdkDsl
    CfnPublicTypeVersion.Builder.() -> Unit = {}): CfnPublicTypeVersion =
    CfnPublicTypeVersion.Builder.create(this, id).apply(initializer).build()
