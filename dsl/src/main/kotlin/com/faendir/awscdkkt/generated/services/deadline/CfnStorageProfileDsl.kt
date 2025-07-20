package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnStorageProfile
import software.amazon.awscdk.services.deadline.CfnStorageProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStorageProfile(
  id: String,
  props: CfnStorageProfileProps,
  initializer: @AwsCdkDsl CfnStorageProfile.() -> Unit = {},
): CfnStorageProfile = CfnStorageProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStorageProfile(id: String, initializer: @AwsCdkDsl CfnStorageProfile.Builder.() -> Unit = {}): CfnStorageProfile = CfnStorageProfile.Builder.create(this, id).apply(initializer).build()
