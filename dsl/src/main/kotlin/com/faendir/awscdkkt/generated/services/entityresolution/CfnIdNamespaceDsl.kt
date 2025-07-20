package com.faendir.awscdkkt.generated.services.entityresolution

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.entityresolution.CfnIdNamespace
import software.amazon.awscdk.services.entityresolution.CfnIdNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdNamespace(
  id: String,
  props: CfnIdNamespaceProps,
  initializer: @AwsCdkDsl CfnIdNamespace.() -> Unit = {},
): CfnIdNamespace = CfnIdNamespace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdNamespace(id: String, initializer: @AwsCdkDsl CfnIdNamespace.Builder.() -> Unit = {}): CfnIdNamespace = CfnIdNamespace.Builder.create(this, id).apply(initializer).build()
