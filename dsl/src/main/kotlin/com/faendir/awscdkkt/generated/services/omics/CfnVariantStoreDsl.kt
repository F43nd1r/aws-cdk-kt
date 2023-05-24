package com.faendir.awscdkkt.generated.services.omics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnVariantStore
import software.amazon.awscdk.services.omics.CfnVariantStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVariantStore(id: String, props: CfnVariantStoreProps): CfnVariantStore =
    CfnVariantStore(this, id, props)

@Generated
public fun Construct.cfnVariantStore(
  id: String,
  props: CfnVariantStoreProps,
  initializer: @AwsCdkDsl CfnVariantStore.() -> Unit,
): CfnVariantStore = CfnVariantStore(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVariantStore(id: String, initializer: @AwsCdkDsl
    CfnVariantStore.Builder.() -> Unit): CfnVariantStore = CfnVariantStore.Builder.create(this,
    id).apply(initializer).build()
