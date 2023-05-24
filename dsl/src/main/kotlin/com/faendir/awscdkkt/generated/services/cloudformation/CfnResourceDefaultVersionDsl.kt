package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceDefaultVersion(id: String, props: CfnResourceDefaultVersionProps):
    CfnResourceDefaultVersion = CfnResourceDefaultVersion(this, id, props)

@Generated
public fun Construct.cfnResourceDefaultVersion(
  id: String,
  props: CfnResourceDefaultVersionProps,
  initializer: @AwsCdkDsl CfnResourceDefaultVersion.() -> Unit,
): CfnResourceDefaultVersion = CfnResourceDefaultVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnResourceDefaultVersion(id: String): CfnResourceDefaultVersion =
    CfnResourceDefaultVersion(this, id)

@Generated
public fun Construct.cfnResourceDefaultVersion(id: String, initializer: @AwsCdkDsl
    CfnResourceDefaultVersion.() -> Unit): CfnResourceDefaultVersion =
    CfnResourceDefaultVersion(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnResourceDefaultVersion(id: String, initializer: @AwsCdkDsl
    CfnResourceDefaultVersion.Builder.() -> Unit): CfnResourceDefaultVersion =
    CfnResourceDefaultVersion.Builder.create(this, id).apply(initializer).build()
