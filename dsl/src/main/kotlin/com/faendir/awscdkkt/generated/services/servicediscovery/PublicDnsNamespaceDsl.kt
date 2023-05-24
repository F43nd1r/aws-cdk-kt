package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.publicDnsNamespace(id: String, props: PublicDnsNamespaceProps):
    PublicDnsNamespace = PublicDnsNamespace(this, id, props)

@Generated
public fun Construct.publicDnsNamespace(
  id: String,
  props: PublicDnsNamespaceProps,
  initializer: @AwsCdkDsl PublicDnsNamespace.() -> Unit,
): PublicDnsNamespace = PublicDnsNamespace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPublicDnsNamespace(id: String, initializer: @AwsCdkDsl
    PublicDnsNamespace.Builder.() -> Unit): PublicDnsNamespace =
    PublicDnsNamespace.Builder.create(this, id).apply(initializer).build()
