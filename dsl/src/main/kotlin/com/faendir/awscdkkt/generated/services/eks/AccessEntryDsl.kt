package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.AccessEntry
import software.amazon.awscdk.services.eks.AccessEntryProps
import software.constructs.Construct

@Generated
public fun Construct.accessEntry(
  id: String,
  props: AccessEntryProps,
  initializer: @AwsCdkDsl AccessEntry.() -> Unit = {},
): AccessEntry = AccessEntry(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAccessEntry(id: String, initializer: @AwsCdkDsl
    AccessEntry.Builder.() -> Unit = {}): AccessEntry = AccessEntry.Builder.create(this,
    id).apply(initializer).build()
