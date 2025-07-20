package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.HttpNamespace
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.httpNamespace(
  id: String,
  props: HttpNamespaceProps,
  initializer: @AwsCdkDsl HttpNamespace.() -> Unit = {},
): HttpNamespace = HttpNamespace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHttpNamespace(id: String, initializer: @AwsCdkDsl HttpNamespace.Builder.() -> Unit = {}): HttpNamespace = HttpNamespace.Builder.create(this, id).apply(initializer).build()
