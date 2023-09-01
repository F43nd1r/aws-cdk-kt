package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPrivateDnsNamespace(
  id: String,
  props: CfnPrivateDnsNamespaceProps,
  initializer: @AwsCdkDsl CfnPrivateDnsNamespace.() -> Unit = {},
): CfnPrivateDnsNamespace = CfnPrivateDnsNamespace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPrivateDnsNamespace(id: String, initializer: @AwsCdkDsl
    CfnPrivateDnsNamespace.Builder.() -> Unit = {}): CfnPrivateDnsNamespace =
    CfnPrivateDnsNamespace.Builder.create(this, id).apply(initializer).build()
