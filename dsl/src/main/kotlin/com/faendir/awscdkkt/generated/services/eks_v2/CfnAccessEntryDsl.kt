package com.faendir.awscdkkt.generated.services.eks_v2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks_v2.CfnAccessEntry
import software.amazon.awscdk.services.eks_v2.CfnAccessEntryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessEntry(
  id: String,
  props: CfnAccessEntryProps,
  initializer: @AwsCdkDsl CfnAccessEntry.() -> Unit = {},
): CfnAccessEntry = CfnAccessEntry(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessEntry(id: String, initializer: @AwsCdkDsl CfnAccessEntry.Builder.() -> Unit = {}): CfnAccessEntry = CfnAccessEntry.Builder.create(this, id).apply(initializer).build()
