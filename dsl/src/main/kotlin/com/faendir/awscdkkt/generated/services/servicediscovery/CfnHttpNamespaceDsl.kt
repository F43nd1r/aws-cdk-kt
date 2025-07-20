package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHttpNamespace(
  id: String,
  props: CfnHttpNamespaceProps,
  initializer: @AwsCdkDsl CfnHttpNamespace.() -> Unit = {},
): CfnHttpNamespace = CfnHttpNamespace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHttpNamespace(id: String, initializer: @AwsCdkDsl CfnHttpNamespace.Builder.() -> Unit = {}): CfnHttpNamespace = CfnHttpNamespace.Builder.create(this, id).apply(initializer).build()
