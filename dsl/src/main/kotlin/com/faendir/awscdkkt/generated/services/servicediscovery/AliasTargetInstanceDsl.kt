package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstance
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.aliasTargetInstance(
  id: String,
  props: AliasTargetInstanceProps,
  initializer: @AwsCdkDsl AliasTargetInstance.() -> Unit = {},
): AliasTargetInstance = AliasTargetInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAliasTargetInstance(id: String, initializer: @AwsCdkDsl AliasTargetInstance.Builder.() -> Unit = {}): AliasTargetInstance = AliasTargetInstance.Builder.create(this, id).apply(initializer).build()
