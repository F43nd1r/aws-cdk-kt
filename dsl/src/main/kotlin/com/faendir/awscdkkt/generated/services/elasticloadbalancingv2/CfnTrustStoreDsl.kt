package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrustStore(id: String, initializer: @AwsCdkDsl CfnTrustStore.() -> Unit = {}): CfnTrustStore = CfnTrustStore(this, id).apply(initializer)

@Generated
public fun Construct.cfnTrustStore(
  id: String,
  props: CfnTrustStoreProps,
  initializer: @AwsCdkDsl CfnTrustStore.() -> Unit = {},
): CfnTrustStore = CfnTrustStore(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrustStore(id: String, initializer: @AwsCdkDsl CfnTrustStore.Builder.() -> Unit = {}): CfnTrustStore = CfnTrustStore.Builder.create(this, id).apply(initializer).build()
