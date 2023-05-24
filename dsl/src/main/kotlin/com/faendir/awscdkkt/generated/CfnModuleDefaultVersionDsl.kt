package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnModuleDefaultVersion
import software.amazon.awscdk.CfnModuleDefaultVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModuleDefaultVersion(id: String, props: CfnModuleDefaultVersionProps):
    CfnModuleDefaultVersion = CfnModuleDefaultVersion(this, id, props)

@Generated
public fun Construct.cfnModuleDefaultVersion(
  id: String,
  props: CfnModuleDefaultVersionProps,
  initializer: @AwsCdkDsl CfnModuleDefaultVersion.() -> Unit,
): CfnModuleDefaultVersion = CfnModuleDefaultVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnModuleDefaultVersion(id: String): CfnModuleDefaultVersion =
    CfnModuleDefaultVersion(this, id)

@Generated
public fun Construct.cfnModuleDefaultVersion(id: String, initializer: @AwsCdkDsl
    CfnModuleDefaultVersion.() -> Unit): CfnModuleDefaultVersion = CfnModuleDefaultVersion(this,
    id).apply(initializer)

@Generated
public fun Construct.buildCfnModuleDefaultVersion(id: String, initializer: @AwsCdkDsl
    CfnModuleDefaultVersion.Builder.() -> Unit): CfnModuleDefaultVersion =
    CfnModuleDefaultVersion.Builder.create(this, id).apply(initializer).build()
