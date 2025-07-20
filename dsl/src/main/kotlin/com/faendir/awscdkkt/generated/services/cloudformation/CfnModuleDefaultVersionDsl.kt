package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModuleDefaultVersion(id: String, initializer: @AwsCdkDsl CfnModuleDefaultVersion.() -> Unit = {}): CfnModuleDefaultVersion = CfnModuleDefaultVersion(this, id).apply(initializer)

@Generated
public fun Construct.cfnModuleDefaultVersion(
  id: String,
  props: CfnModuleDefaultVersionProps,
  initializer: @AwsCdkDsl CfnModuleDefaultVersion.() -> Unit = {},
): CfnModuleDefaultVersion = CfnModuleDefaultVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnModuleDefaultVersion(id: String, initializer: @AwsCdkDsl CfnModuleDefaultVersion.Builder.() -> Unit = {}): CfnModuleDefaultVersion = CfnModuleDefaultVersion.Builder.create(this, id).apply(initializer).build()
