package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.KubectlProvider
import software.amazon.awscdk.services.eks.KubectlProviderProps
import software.constructs.Construct

@Generated
public fun Construct.kubectlProvider(
  id: String,
  props: KubectlProviderProps,
  initializer: @AwsCdkDsl KubectlProvider.() -> Unit = {},
): KubectlProvider = KubectlProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildKubectlProvider(id: String, initializer: @AwsCdkDsl
    KubectlProvider.Builder.() -> Unit = {}): KubectlProvider = KubectlProvider.Builder.create(this,
    id).apply(initializer).build()
