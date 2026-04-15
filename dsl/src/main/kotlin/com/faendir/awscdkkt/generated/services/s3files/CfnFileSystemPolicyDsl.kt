package com.faendir.awscdkkt.generated.services.s3files

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3files.CfnFileSystemPolicy
import software.amazon.awscdk.services.s3files.CfnFileSystemPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFileSystemPolicy(
  id: String,
  props: CfnFileSystemPolicyProps,
  initializer: @AwsCdkDsl CfnFileSystemPolicy.() -> Unit = {},
): CfnFileSystemPolicy = CfnFileSystemPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFileSystemPolicy(id: String, initializer: @AwsCdkDsl CfnFileSystemPolicy.Builder.() -> Unit = {}): CfnFileSystemPolicy = CfnFileSystemPolicy.Builder.create(this, id).apply(initializer).build()
