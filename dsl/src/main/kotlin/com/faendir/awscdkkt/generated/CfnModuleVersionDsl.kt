package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnModuleVersion
import software.amazon.awscdk.CfnModuleVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModuleVersion(
  id: String,
  props: CfnModuleVersionProps,
  initializer: @AwsCdkDsl CfnModuleVersion.() -> Unit = {},
): CfnModuleVersion = CfnModuleVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnModuleVersion(id: String, initializer: @AwsCdkDsl
    CfnModuleVersion.Builder.() -> Unit = {}): CfnModuleVersion =
    CfnModuleVersion.Builder.create(this, id).apply(initializer).build()
