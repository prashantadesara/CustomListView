package com.prashant.adesara.custom.model;

/**
 * @author Prashant Adesara
 **/
public class ItemsDTO
{
	private String mainTitle;
	private String subTitle;
	private String comment;
	private String dateTime;

	public ItemsDTO()
	{
	}

	public ItemsDTO(String mainT, String subT, String comment, String dateT)
	{
		this.mainTitle = mainT;
		this.subTitle = subT;
		this.comment = comment;
		this.dateTime = dateT;
	}

	public String getMainTitle()
	{
		return mainTitle;
	}

	public String getSubTitle()
	{
		return subTitle;
	}

	public String getComment()
	{
		return comment;
	}

	public String getDateTime()
	{
		return dateTime;
	}

	public void setMainTitle(String mainTitle)
	{
		this.mainTitle = mainTitle;
	}

	public void setSubTitle(String subTitle)
	{
		this.subTitle = subTitle;
	}

	public void setComment(String comment)
	{
		this.comment = comment;
	}

	public void setDateTime(String dateTime)
	{
		this.dateTime = dateTime;
	}

}
