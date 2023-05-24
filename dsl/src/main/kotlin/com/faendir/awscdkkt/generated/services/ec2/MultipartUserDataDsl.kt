package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.MultipartUserData
import software.amazon.awscdk.services.ec2.MultipartUserDataOptions

@Generated
public fun multipartUserData(opts: MultipartUserDataOptions): MultipartUserData =
    MultipartUserData(opts)

@Generated
public fun multipartUserData(): MultipartUserData = MultipartUserData()

@Generated
public fun buildMultipartUserData(initializer: @AwsCdkDsl MultipartUserData.Builder.() -> Unit):
    MultipartUserData = MultipartUserData.Builder.create().apply(initializer).build()
