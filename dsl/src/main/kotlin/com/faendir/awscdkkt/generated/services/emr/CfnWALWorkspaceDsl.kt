package com.faendir.awscdkkt.generated.services.emr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnWALWorkspace
import software.amazon.awscdk.services.emr.CfnWALWorkspaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWALWorkspace(id: String, initializer: @AwsCdkDsl CfnWALWorkspace.() -> Unit
    = {}): CfnWALWorkspace = CfnWALWorkspace(this, id).apply(initializer)

@Generated
public fun Construct.cfnWALWorkspace(
  id: String,
  props: CfnWALWorkspaceProps,
  initializer: @AwsCdkDsl CfnWALWorkspace.() -> Unit = {},
): CfnWALWorkspace = CfnWALWorkspace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWALWorkspace(id: String, initializer: @AwsCdkDsl
    CfnWALWorkspace.Builder.() -> Unit = {}): CfnWALWorkspace = CfnWALWorkspace.Builder.create(this,
    id).apply(initializer).build()
