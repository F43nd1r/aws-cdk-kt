package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.MediaPackageV2OriginAccessControl
import software.amazon.awscdk.services.cloudfront.MediaPackageV2OriginAccessControlProps
import software.constructs.Construct

@Generated
public fun Construct.mediaPackageV2OriginAccessControl(id: String, initializer: @AwsCdkDsl MediaPackageV2OriginAccessControl.() -> Unit = {}): MediaPackageV2OriginAccessControl = MediaPackageV2OriginAccessControl(this, id).apply(initializer)

@Generated
public fun Construct.mediaPackageV2OriginAccessControl(
  id: String,
  props: MediaPackageV2OriginAccessControlProps,
  initializer: @AwsCdkDsl MediaPackageV2OriginAccessControl.() -> Unit = {},
): MediaPackageV2OriginAccessControl = MediaPackageV2OriginAccessControl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildMediaPackageV2OriginAccessControl(id: String, initializer: @AwsCdkDsl MediaPackageV2OriginAccessControl.Builder.() -> Unit = {}): MediaPackageV2OriginAccessControl = MediaPackageV2OriginAccessControl.Builder.create(this, id).apply(initializer).build()
