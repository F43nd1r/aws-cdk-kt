package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PrefixList
import software.amazon.awscdk.services.ec2.PrefixListProps
import software.constructs.Construct

@Generated
public fun Construct.prefixList(id: String, initializer: @AwsCdkDsl PrefixList.() -> Unit = {}): PrefixList = PrefixList(this, id).apply(initializer)

@Generated
public fun Construct.prefixList(
  id: String,
  props: PrefixListProps,
  initializer: @AwsCdkDsl PrefixList.() -> Unit = {},
): PrefixList = PrefixList(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPrefixList(id: String, initializer: @AwsCdkDsl PrefixList.Builder.() -> Unit = {}): PrefixList = PrefixList.Builder.create(this, id).apply(initializer).build()
