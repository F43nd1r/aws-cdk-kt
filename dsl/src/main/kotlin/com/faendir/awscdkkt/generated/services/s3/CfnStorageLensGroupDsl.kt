package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLensGroup
import software.amazon.awscdk.services.s3.CfnStorageLensGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStorageLensGroup(
  id: String,
  props: CfnStorageLensGroupProps,
  initializer: @AwsCdkDsl CfnStorageLensGroup.() -> Unit = {},
): CfnStorageLensGroup = CfnStorageLensGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStorageLensGroup(id: String, initializer: @AwsCdkDsl CfnStorageLensGroup.Builder.() -> Unit = {}): CfnStorageLensGroup = CfnStorageLensGroup.Builder.create(this, id).apply(initializer).build()
