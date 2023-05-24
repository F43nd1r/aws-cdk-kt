package com.faendir.awscdkkt.generated.services.omics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnAnnotationStore
import software.amazon.awscdk.services.omics.CfnAnnotationStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnnotationStore(id: String, props: CfnAnnotationStoreProps):
    CfnAnnotationStore = CfnAnnotationStore(this, id, props)

@Generated
public fun Construct.cfnAnnotationStore(
  id: String,
  props: CfnAnnotationStoreProps,
  initializer: @AwsCdkDsl CfnAnnotationStore.() -> Unit,
): CfnAnnotationStore = CfnAnnotationStore(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAnnotationStore(id: String, initializer: @AwsCdkDsl
    CfnAnnotationStore.Builder.() -> Unit): CfnAnnotationStore =
    CfnAnnotationStore.Builder.create(this, id).apply(initializer).build()
