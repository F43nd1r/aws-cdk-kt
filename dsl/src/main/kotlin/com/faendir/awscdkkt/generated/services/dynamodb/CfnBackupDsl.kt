package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnBackup
import software.amazon.awscdk.services.dynamodb.CfnBackupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBackup(
  id: String,
  props: CfnBackupProps,
  initializer: @AwsCdkDsl CfnBackup.() -> Unit = {},
): CfnBackup = CfnBackup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBackup(id: String, initializer: @AwsCdkDsl CfnBackup.Builder.() -> Unit = {}): CfnBackup = CfnBackup.Builder.create(this, id).apply(initializer).build()
