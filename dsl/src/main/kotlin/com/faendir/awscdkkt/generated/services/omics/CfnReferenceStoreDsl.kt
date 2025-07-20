package com.faendir.awscdkkt.generated.services.omics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnReferenceStore
import software.amazon.awscdk.services.omics.CfnReferenceStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReferenceStore(
  id: String,
  props: CfnReferenceStoreProps,
  initializer: @AwsCdkDsl CfnReferenceStore.() -> Unit = {},
): CfnReferenceStore = CfnReferenceStore(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReferenceStore(id: String, initializer: @AwsCdkDsl CfnReferenceStore.Builder.() -> Unit = {}): CfnReferenceStore = CfnReferenceStore.Builder.create(this, id).apply(initializer).build()
