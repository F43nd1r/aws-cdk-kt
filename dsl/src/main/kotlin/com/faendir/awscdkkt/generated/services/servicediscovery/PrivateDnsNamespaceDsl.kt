package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.privateDnsNamespace(id: String, props: PrivateDnsNamespaceProps):
    PrivateDnsNamespace = PrivateDnsNamespace(this, id, props)

@Generated
public fun Construct.privateDnsNamespace(
  id: String,
  props: PrivateDnsNamespaceProps,
  initializer: @AwsCdkDsl PrivateDnsNamespace.() -> Unit,
): PrivateDnsNamespace = PrivateDnsNamespace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPrivateDnsNamespace(id: String, initializer: @AwsCdkDsl
    PrivateDnsNamespace.Builder.() -> Unit): PrivateDnsNamespace =
    PrivateDnsNamespace.Builder.create(this, id).apply(initializer).build()
