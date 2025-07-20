package com.faendir.awscdkkt.generated.services.omics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnSequenceStore
import software.amazon.awscdk.services.omics.CfnSequenceStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSequenceStore(
  id: String,
  props: CfnSequenceStoreProps,
  initializer: @AwsCdkDsl CfnSequenceStore.() -> Unit = {},
): CfnSequenceStore = CfnSequenceStore(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSequenceStore(id: String, initializer: @AwsCdkDsl CfnSequenceStore.Builder.() -> Unit = {}): CfnSequenceStore = CfnSequenceStore.Builder.create(this, id).apply(initializer).build()
