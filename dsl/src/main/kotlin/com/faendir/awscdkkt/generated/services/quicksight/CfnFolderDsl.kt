package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnFolder
import software.amazon.awscdk.services.quicksight.CfnFolderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFolder(id: String, initializer: @AwsCdkDsl CfnFolder.() -> Unit = {}): CfnFolder = CfnFolder(this, id).apply(initializer)

@Generated
public fun Construct.cfnFolder(
  id: String,
  props: CfnFolderProps,
  initializer: @AwsCdkDsl CfnFolder.() -> Unit = {},
): CfnFolder = CfnFolder(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFolder(id: String, initializer: @AwsCdkDsl CfnFolder.Builder.() -> Unit = {}): CfnFolder = CfnFolder.Builder.create(this, id).apply(initializer).build()
