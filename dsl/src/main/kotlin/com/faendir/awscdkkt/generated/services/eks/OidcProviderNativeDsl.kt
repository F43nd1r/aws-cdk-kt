package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.OidcProviderNative
import software.amazon.awscdk.services.eks.OidcProviderNativeProps
import software.constructs.Construct

@Generated
public fun Construct.oidcProviderNative(
  id: String,
  props: OidcProviderNativeProps,
  initializer: @AwsCdkDsl OidcProviderNative.() -> Unit = {},
): OidcProviderNative = OidcProviderNative(this, id, props).apply(initializer)

@Generated
public fun Construct.buildOidcProviderNative(id: String, initializer: @AwsCdkDsl OidcProviderNative.Builder.() -> Unit = {}): OidcProviderNative = OidcProviderNative.Builder.create(this, id).apply(initializer).build()
