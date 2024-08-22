package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.TrustStore
import software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreProps
import software.constructs.Construct

@Generated
public fun Construct.trustStore(
  id: String,
  props: TrustStoreProps,
  initializer: @AwsCdkDsl TrustStore.() -> Unit = {},
): TrustStore = TrustStore(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTrustStore(id: String, initializer: @AwsCdkDsl
    TrustStore.Builder.() -> Unit = {}): TrustStore = TrustStore.Builder.create(this,
    id).apply(initializer).build()
