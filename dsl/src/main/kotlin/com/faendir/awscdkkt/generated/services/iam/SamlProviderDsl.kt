package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.SamlProvider
import software.amazon.awscdk.services.iam.SamlProviderProps
import software.constructs.Construct

@Generated
public fun Construct.samlProvider(
  id: String,
  props: SamlProviderProps,
  initializer: @AwsCdkDsl SamlProvider.() -> Unit = {},
): SamlProvider = SamlProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSamlProvider(id: String, initializer: @AwsCdkDsl SamlProvider.Builder.() -> Unit = {}): SamlProvider = SamlProvider.Builder.create(this, id).apply(initializer).build()
