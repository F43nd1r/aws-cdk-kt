package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationAzureBlob
import software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationAzureBlob(id: String, props: CfnLocationAzureBlobProps):
    CfnLocationAzureBlob = CfnLocationAzureBlob(this, id, props)

@Generated
public fun Construct.cfnLocationAzureBlob(
  id: String,
  props: CfnLocationAzureBlobProps,
  initializer: @AwsCdkDsl CfnLocationAzureBlob.() -> Unit,
): CfnLocationAzureBlob = CfnLocationAzureBlob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocationAzureBlob(id: String, initializer: @AwsCdkDsl
    CfnLocationAzureBlob.Builder.() -> Unit): CfnLocationAzureBlob =
    CfnLocationAzureBlob.Builder.create(this, id).apply(initializer).build()
