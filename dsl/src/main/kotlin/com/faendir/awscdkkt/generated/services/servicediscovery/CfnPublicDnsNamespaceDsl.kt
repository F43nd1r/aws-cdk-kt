package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPublicDnsNamespace(
  id: String,
  props: CfnPublicDnsNamespaceProps,
  initializer: @AwsCdkDsl CfnPublicDnsNamespace.() -> Unit = {},
): CfnPublicDnsNamespace = CfnPublicDnsNamespace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPublicDnsNamespace(id: String, initializer: @AwsCdkDsl CfnPublicDnsNamespace.Builder.() -> Unit = {}): CfnPublicDnsNamespace = CfnPublicDnsNamespace.Builder.create(this, id).apply(initializer).build()
